package NPV.demo.repository;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface CertificateRepository {

    void init();

    void store(MultipartFile file);

    Path load(String filename);

    Resource loadAsResource(String filename);

    void update(MultipartFile file, String filename);

    void delete(String filename);


}
