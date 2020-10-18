package com.urise.exception;

public class ExistStorageException extends StorageException {
    public ExistStorageException(String uuid) {
        super("Resumeтати" + uuid + "already exist", uuid);
    }
}
