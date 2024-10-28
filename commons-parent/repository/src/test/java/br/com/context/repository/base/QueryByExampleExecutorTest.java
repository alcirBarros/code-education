//package br.com.context.repository.base;
//
//import br.com.context.model.BaseEntity;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.Example;
//import org.springframework.data.repository.query.QueryByExampleExecutor;
//import org.springframework.stereotype.Repository;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//@SpringBootTest
//class QueryByExampleExecutorTest {
//
//    @Autowired
//    private QueryByExampleExecutorRepository queryByExampleExecutorRepository;
//
//    @Test
//    public void findAllSort() {
//        Example<BaseEntity> of = Example.of(new BaseEntity());
//        Optional<BaseEntity> baseEntityOptional = queryByExampleExecutorRepository.findOne(of);
//        assertNotNull(baseEntityOptional, "Deve ser verdadeiro");
//    }
//}
//
//@Repository
//interface QueryByExampleExecutorRepository extends QueryByExampleExecutor<BaseEntity> {
//}
