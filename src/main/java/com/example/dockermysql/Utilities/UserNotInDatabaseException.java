package com.example.dockermysql.Utilities;

public class UserNotInDatabaseException extends Exception{
        public UserNotInDatabaseException(String message){
            super(message);
        }
    }

