package com.example.home.dtos.tasks;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fmi.homemanagement.dto.MemberDto;
import com.fmi.homemanagement.models.Task;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateTaskDto extends TaskSimpleDto {
    private Set<MemberDto> users;
    private Set<MemberDto> groups;

    @Builder(builderMethodName = "createTaskDtoBuilder")
    public CreateTaskDto(Long id,String title, String content, Task.Category category, Set<MemberDto> users, Set<MemberDto> groups) {
        super(id, title, content, category);
        this.users = users;
        this.groups = groups;
    }
}
