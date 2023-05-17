package com.ferrari.formula1_team.exception;

import com.ferrari.formula1_team.enums.ExceptionMessageEnum;

public class TeamNotFoundException extends RuntimeException {
    public TeamNotFoundException() {
        super(ExceptionMessageEnum.TEAM_NOT_FOUND_EXCEPTION.name());
    }
}
