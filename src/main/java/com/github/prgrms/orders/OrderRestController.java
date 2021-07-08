package com.github.prgrms.orders;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.prgrms.errors.NotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import static com.github.prgrms.utils.ApiUtils.ApiResult;
import static com.github.prgrms.utils.ApiUtils.success;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("api/orders")
public class OrderRestController {
  // TODO findAll, findById, accept, reject, shipping, complete 메소드 구현이 필요합니다.

  @GetMapping("{id}")
  public void findById(@PathVariable Long id) {
    System.out.println("order search");
  }

  @GetMapping
  public void findAll(){
    System.out.println("order All");
  }

  
  @PatchMapping("{id}/accept")
  public void accept(@PathVariable Long id){
    System.out.println("accept");
  }
  @PatchMapping("{id}/shipping")
  public void shipping(@PathVariable Long id){
    System.out.println("shipping");
  }
  @PatchMapping("{id}/complete")
  public void complete(@PathVariable Long id){
    System.out.println("complete");
  }
  
  @PatchMapping("{id}/reject")
  public void reject(@PathVariable Long id){
    System.out.println("reject");
  }

}