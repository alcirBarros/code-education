//package br.com.apirest.initialize;
//
//import java.util.Set;
//import java.util.stream.Collectors;
//import java.util.stream.StreamSupport;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
////import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import br.com.apirest.models.client.entity.Client;
//import br.com.apirest.models.client.repository.ClientRepository;
//import br.com.apirest.models.foundation.entity.Credential;
//
//import br.com.apirest.models.user.entity.Permission;
//import br.com.apirest.models.user.entity.Role;
//import br.com.apirest.models.user.entity.User;
//import br.com.apirest.models.user.repository.PermissionRepository;
//import br.com.apirest.models.user.repository.RoleRepository;
//import br.com.apirest.models.user.repository.UserRepository;
//
//@Component
//public class DemoData implements CommandLineRunner {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private RoleRepository roleRepository;
//
//    @Autowired
//    private PermissionRepository permissionRepository;
//
//    @Autowired
//    private ClientRepository clientRepository;
//
////    @Autowired
////    private PasswordEncoder passwordEncoder;
//
//    @Override
//    @Transactional
//    public void run(String... args) throws Exception {
//
////        permissionRepository.save(new Permission("VIS_CLIENTE"));
////        permissionRepository.save(new Permission("VIS_USUARIO"));
////        permissionRepository.save(new Permission("VIS_PRODUTO"));
////        permissionRepository.save(new Permission("VIS_CATEGORIAPRODUTO"));
////        permissionRepository.save(new Permission("VIS_CATEGORIA"));
////        permissionRepository.save(new Permission("VIS_VENDA"));
////        permissionRepository.save(new Permission("VIS_ITEMVENDA"));
////        permissionRepository.save(new Permission("VIS_ITEM"));
//
//        Role roleView = new Role();
//        roleView.setName("CLIENT");
//
//        Iterable<Permission> permissionsView = permissionRepository.findAll();
//        Set<Permission> permissionsViewList = StreamSupport.stream(permissionsView.spliterator(), false).collect(Collectors.toSet());
//        roleView.setPermissions(permissionsViewList);
//        roleView = roleRepository.save(roleView);
//
////        permissionRepository.save(new Permission("CAD_CLIENTE"));
////        permissionRepository.save(new Permission("CAD_USUARIO"));
////        permissionRepository.save(new Permission("CAD_PRODUTO"));
////        permissionRepository.save(new Permission("CAD_CATEGORIAPRODUTO"));
////        permissionRepository.save(new Permission("CAD_CATEGORIA"));
////        permissionRepository.save(new Permission("CAD_VENDA"));
////        permissionRepository.save(new Permission("CAD_ITEMVENDA"));
////        permissionRepository.save(new Permission("CAD_ITEM"));
////        permissionRepository.save(new Permission("ALT_CLIENTE"));
////        permissionRepository.save(new Permission("ALT_USUARIO"));
////        permissionRepository.save(new Permission("ALT_PRODUTO"));
////        permissionRepository.save(new Permission("ALT_CATEGORIAPRODUTO"));
////        permissionRepository.save(new Permission("ALT_VENDA"));
////        permissionRepository.save(new Permission("ALT_ITEMVENDA"));
////        permissionRepository.save(new Permission("ALT_ITEM"));
////        permissionRepository.save(new Permission("ALT_CATEGORIA"));
////        permissionRepository.save(new Permission("EXC_CLIENTE"));
////        permissionRepository.save(new Permission("EXC_USUARIO"));
////        permissionRepository.save(new Permission("EXC_PRODUTO"));
////        permissionRepository.save(new Permission("EXC_CATEGORIAPRODUTO"));
////        permissionRepository.save(new Permission("EXC_VENDA"));
////        permissionRepository.save(new Permission("EXC_ITEMVENDA"));
////        permissionRepository.save(new Permission("EXC_ITEM"));
//
//        Role role = new Role();
//
//        role.setName("ADMIN");
//        Iterable<Permission> permissions = permissionRepository.findAll();
//        Set<Permission> permissionsList = StreamSupport.stream(permissions.spliterator(), false).collect(Collectors.toSet());
//
//        role.setPermissions(permissionsList);
//        role = roleRepository.save(role);
//
////        {
////            Credential credentialUser = new Credential("admin@admin.com.br", "password");
////            String encode = passwordEncoder.encode(credentialUser.getPassword());
////            credentialUser.setPassword(encode);
////            credentialUser.setRole(role);
////
////            User user = new User();
////            user.setCredential(credentialUser);
////            user.setName("Admin");
////            user.setFamilyName("Admin");
////            userRepository.save(user);
////        }
//
////        {
////
////            Credential credentialUserView = new Credential("user", "user");
////            String encode = passwordEncoder.encode(credentialUserView.getPassword());
////            credentialUserView.setPassword(encode);
////            credentialUserView.setRole(roleView);
////
////            User userView = new User();
////            userView.setCredential(credentialUserView);
////            userRepository.save(userView);
////
////        }
//
////        {
////            Credential credentialClient = new Credential("client", "client");
////            String encode = passwordEncoder.encode(credentialClient.getPassword());
////            credentialClient.setPassword(encode);
////            credentialClient.setRole(roleView);
////
////            Client client = new Client();
////            client.setCredential(credentialClient);
////            client.setName("Carlos");
////            client.setFamilyName("Silva");
////            clientRepository.save(client);
////
////        }
//
//    }
//
//}
