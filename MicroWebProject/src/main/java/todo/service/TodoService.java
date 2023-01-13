package todo.service;

import todo.dto.TodoDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//프로그램이 구현해야하는 기능들의 실제 처리를 담당
//enum은 상수처럼 활용할 수 있는 타입
public enum TodoService {
    INSTANCE; //싱글턴 패턴: 하나의 객체만을 생성

    public void register(TodoDTO todoDTO){
        System.out.println("DEBUG......."+todoDTO);
    }


    //10개의 TodoDTO 객체를 만들어 반환
    public List<TodoDTO> getList(){
        List<TodoDTO> todoDTOS = IntStream.range(0,10).mapToObj(i-> {
            TodoDTO dto = new TodoDTO();
            dto.setTno((long)i);
            dto.setTitle("Todo.."+i);
            dto.setDueDate(LocalDate.now());

            return dto;
        }).collect(Collectors.toList());

        return todoDTOS;
    }
}
