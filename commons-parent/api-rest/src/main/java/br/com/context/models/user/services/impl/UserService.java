//package br.com.apirest.models.user.services.impl;
//
//import java.io.IOException;
//import java.util.Iterator;
//import java.util.Optional;
//import java.util.UUID;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import br.com.apirest.exception.CustomException;
//import br.com.apirest.models.client.entity.Client;
//import br.com.apirest.models.client.repository.ClientRepository;
//import br.com.apirest.models.foundation.entity.Credential;
//import br.com.apirest.models.foundation.util.ImageUtils;
//import br.com.apirest.models.user.entity.Autorization;
//import br.com.apirest.models.user.entity.Role;
//import br.com.apirest.models.user.entity.User;
//import br.com.apirest.models.user.repository.CredentialRepository;
//import br.com.apirest.models.user.repository.RoleRepository;
//import br.com.apirest.models.user.repository.UserRepository;
//import br.com.apirest.models.user.services.IUserService;
//import br.com.apirest.security.JwtTokenProvider;
//
//@Service
//public class UserService implements IUserService {
//
//    private final Logger logger = LoggerFactory.getLogger(this.getClass());
//    private UserRepository userRepository;
//    private RoleRepository roleRepository;
//    private PasswordEncoder passwordEncoder;
//    private JwtTokenProvider jwtTokenProvider;
//    private CredentialRepository credentialRepository;
//    private ClientRepository clientRepository;
//
//    @Autowired
//    public void setUserRepository(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder, JwtTokenProvider jwtTokenProvider, ClientRepository clientRepository, CredentialRepository credentialRepository) {
//        this.userRepository = userRepository;
//        this.roleRepository = roleRepository;
//        this.passwordEncoder = passwordEncoder;
//        this.jwtTokenProvider = jwtTokenProvider;
//        this.credentialRepository = credentialRepository;
//        this.clientRepository = clientRepository;
//    }
//
//    @Override
//    @Transactional
//    public Autorization signin(Credential credential) {
//        try {
//
//            final Credential localCredential = this.credentialRepository.findByUsername(credential.getUsername());
//
//            if (localCredential != null && passwordEncoder.matches(credential.getPassword(), localCredential.getPassword())) {
//                User user = this.userRepository.findByCredential(localCredential);
//                Client client = null;
//                String nameUser = null;
//                String picture = null;
//                if (user == null) {
//                    client = this.clientRepository.findByCredential(localCredential);
//                    if (client != null) {
//                        nameUser = client.getName() + " " + client.getFamilyName();
//                        picture = ImageUtils.getBase64Image(client.getPictureName(), client.getPictureExtension());
//                    }
//                } else {
//                    nameUser = user.getName() + " " + user.getFamilyName();
//                    picture = ImageUtils.getBase64Image(user.getPictureName(), user.getPictureExtension());
//                }
//                System.out.println("Authenticated");
//                Autorization auth = new Autorization(jwtTokenProvider.createToken(localCredential.getUsername(), localCredential.getRole()), nameUser, picture);
//                return auth;
//            } else {
//                throw new CustomException("Invalid username/password supplied", HttpStatus.UNPROCESSABLE_ENTITY);
//            }
//
//        } catch (AuthenticationException e) {
//            throw new CustomException("Invalid username/password supplied", HttpStatus.UNPROCESSABLE_ENTITY);
//        }
//    }
//
//    @Override
//    public Iterable<User> listAllUsers() {
//        logger.debug("UserService::listAllUser called");
//        Iterable<User> users = userRepository.findAll();
//        Iterator<User> usersIt = users.iterator();
//        while (usersIt.hasNext()) {
//            User u = usersIt.next();
//            u.setPicture(ImageUtils.getBase64Image(u.getPictureName(), u.getPictureExtension()));
//        }
//        return users;
//    }
//
//    @Override
//    public User getUserById(Integer id) {
//        logger.debug("UserService::getById called");
//        Optional<User> user = userRepository.findById(id);
//        if (user.isPresent()) {
//            User u = user.get();
//            u.setPicture(ImageUtils.getBase64Image(u.getPictureName(), u.getPictureExtension()));
//            return u;
//        } else {
//            return null;
//        }
//
//    }
//
//    @Override
//    public User saveUser(User user) {
//        logger.debug("UserService::saveUser called");
//        if (user.getPicture() != null && !user.getPicture().isEmpty()) {
//            String pictureFilename = user.getPictureName() == null ? UUID.randomUUID().toString() : user.getPictureName();
//            user.setPictureName(pictureFilename);
//            user.setPictureExtension(ImageUtils.getBase64ImageExtension(user.getPicture()));
//
//            try {
//                ImageUtils.saveBase64Image(ImageUtils.getBase64ImageData(user.getPicture()), pictureFilename);
//            } catch (IOException e) {
//                logger.debug("ImageUtils.saveBase64Image called fail:" + e.getMessage());
//            }
//        }
//        user.getCredential().setRole(findRoleByName(user.getRole()));
//
//        if (user.getId() != null && user.getCredential().getPassword() != null && !user.getCredential().getPassword().isEmpty()) {
//            user.getCredential().setPassword(passwordEncoder.encode(user.getCredential().getPassword()));
//        } else if (user.getId() == null) {
//            user.getCredential().setPassword(passwordEncoder.encode(user.getCredential().getPassword()));
//
//        } else {
//            User pass = this.getUserById(user.getId());
//            user.getCredential().setPassword(pass.getCredential().getPassword());
//        }
//        return this.userRepository.save(user);
//    }
//
//    @Override
//    public void deleteUser(Integer id) {
//        logger.debug("UserService::deleteUser called");
//        this.userRepository.deleteById(id);
//    }
//
//    @Override
//    public Role findRoleByName(String name) {
//        return this.roleRepository.findByName(name);
//    }
//
//    @Override
//    public Iterable<Role> listAllRoles() {
//        return this.roleRepository.findAll();
//    }
//}
