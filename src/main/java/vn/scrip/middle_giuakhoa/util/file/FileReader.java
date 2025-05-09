package vn.scrip.middle_giuakhoa.util.file;

import java.io.IOException;

public interface FileReader<T> {
    T read(String path) throws IOException;
}
