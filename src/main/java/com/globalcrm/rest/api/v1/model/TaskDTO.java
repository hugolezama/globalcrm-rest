package com.globalcrm.rest.api.v1.model;

import com.globalcrm.rest.domain.TaskStatus;
import com.globalcrm.rest.domain.TaskType;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by Hugo Lezama on May - 2018
 */
@Data
public class TaskDTO {
    private Long id;
    private String title;
    private String description;
    private TaskType type;
    private TaskStatus status;
    private LocalDateTime dueDate;
    private UserDTO assignedTo;
    private UserDTO createdBy;
    private ContactDTO linkedTo;
    private boolean privateTask;
}
