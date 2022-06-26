package com.david.webservice.web;

import com.david.webservice.domain.posts.PostsRepository;
import com.david.webservice.dto.PostsSaveRequestDto;
import com.david.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsService postsService;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto){
        return postsService.save(dto);
//        이부분이 원래 컨트롤러에서 바로 저장(service 사용 x)
//        postsRepository.save(dto.toEntity());
    }
}
