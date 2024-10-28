//package br.com.apirest.models.client.services.impl;
//
//import java.io.IOException;
//import java.util.Date;
//import java.util.Iterator;
//import java.util.Optional;
//import java.util.UUID;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//import br.com.apirest.models.client.entity.Client;
//import br.com.apirest.models.client.repository.ClientRepository;
//import br.com.apirest.models.client.services.IClientService;
//import br.com.apirest.models.foundation.util.ImageUtils;
//import br.com.apirest.models.user.entity.Role;
//import br.com.apirest.models.user.repository.RoleRepository;
//import java.util.List;
//
//@Service
//public class ClientService implements IClientService {
//
//    private final Logger logger = LoggerFactory.getLogger(this.getClass());
//    private ClientRepository clientRepository;
//    private RoleRepository roleRepository;
//    private PasswordEncoder passwordEncoder;
//
//    @Autowired
//    public void setClientRepository(ClientRepository clientRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
//        this.roleRepository = roleRepository;
//        this.passwordEncoder = passwordEncoder;
//        this.clientRepository = clientRepository;
//    }
//
//    @Override
//    public List<Client> listAllClients() {
//        logger.debug("ClientService::listAllClients called");
//        Iterable<Client> clients = clientRepository.findAll();
//        Iterator<Client> clientsIt = clients.iterator();
//        while (clientsIt.hasNext()) {
//            Client c = clientsIt.next();
//            c.setPicture(ImageUtils.getBase64Image(c.getPictureName(), c.getPictureExtension()));
//        }
//        return null;
//    }
//
////    @Override
////    public Optional<Client> getClientById(Integer id) {
////        logger.debug("ClientService::getClientById called");
////        Optional<Client> client = clientRepository.findById(id);
////        if (client.isPresent()) {
////            Client c = client.get();
////            c.setPicture(ImageUtils.getBase64Image(c.getPictureName(), c.getPictureExtension()));
////            return client;
////        } else {
////            return null;
////        }
////
////    }
//
////    @Override
////    public Client saveClient(Client client) {
////        logger.debug("ClientService::saveClient called");
////        if (client.getPicture() != null && !client.getPicture().isEmpty()) {
////            String pictureFilename = client.getPictureName() == null ? UUID.randomUUID().toString() : client.getPictureName();
////
////            client.setPictureName(pictureFilename);
////            client.setPictureExtension(ImageUtils.getBase64ImageExtension(client.getPicture()));
////            try {
////                ImageUtils.saveBase64Image(ImageUtils.getBase64ImageData(client.getPicture()), pictureFilename);
////            } catch (IOException e) {
////                logger.debug("ImageUtils.saveBase64Image called fail:" + e.getMessage());
////            }
////        }
////
////        client.getCredential().setRole(findRoleByName(client.getRole()));
////
////        if (client.getId() != null && client.getCredential().getPassword() != null && !client.getCredential().getPassword().isEmpty()) {
////            client.getCredential().setPassword(passwordEncoder.encode(client.getCredential().getPassword()));
////        } else if (client.getId() == null) {
////            client.getCredential().setPassword(passwordEncoder.encode(client.getCredential().getPassword()));
////
////        } else {
////            Client pass = this.getClientById(client.getId());
////            client.getCredential().setPassword(pass.getCredential().getPassword());
////        }
////
////        client.setCreatedAt(new Date());
////        client.setUpdatedAt(new Date());
////        return clientRepository.save(client);
////    }
//
//    @Override
//    public void deleteClient(Integer id) {
//        logger.debug("ClientService::deleteClient called");
//        clientRepository.deleteById(id);
//    }
//
//    @Override
//    public Role findRoleByName(String name) {
//        return this.roleRepository.findByName(name);
//    }
//
//    @Override
//    public Optional<Client> findById(Integer id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Client save(Client client) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Client getClientById(Integer id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//}
