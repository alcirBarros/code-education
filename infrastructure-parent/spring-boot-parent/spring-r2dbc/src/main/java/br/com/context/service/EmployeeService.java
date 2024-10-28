//package br.com.context.service;
//
//import br.com.context.enumerator.StatusESocialEventEnum;
//import br.com.context.model.ESocialEventEntity;
//import br.com.context.repository.ESocialEventRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class EmployeeService {
//
//  private final ESocialEventRepository eSocialEventRepository;
//  public Mono<Page<ESocialEventEntity>> findAllByStatus(StatusESocialEventEnum statusESocialEventEnum, Pageable pageable){
//    Integer idStatus = statusESocialEventEnum.getIdStatus();
//    return this.eSocialEventRepository.findAllByStatus(idStatus, pageable).collectList()
//        .zipWith(this.eSocialEventRepository.countByStatus(idStatus))
//        .map(t -> new PageImpl<>(t.getT1(), pageable, t.getT2()));
//  }
//
//}
