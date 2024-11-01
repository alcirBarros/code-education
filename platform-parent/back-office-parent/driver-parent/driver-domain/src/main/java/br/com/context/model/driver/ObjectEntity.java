package br.com.context.model.driver;

import br.com.context.model.AbstractEntidade;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "obj_objeto", catalog = "driver")
@Inheritance(strategy = InheritanceType.JOINED)
public class ObjectEntity extends AbstractEntidade {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator",
            parameters = {
                @Parameter(
                        name = "uuid_gen_strategy_class",
                        value = "org.hibernate.id.uuid.CustomVersionOneStrategy"
                )
            })
    @Column(name = "obj_uuid", updatable = false, nullable = false)
    private UUID uuid;

    @Column(name = "obj_file_name")
    private String fileName;

    @Column(name = "obj_file_type")
    private String fileType;

    @Column(name = "obj_byte", length = 10000)
    private byte[] getContents;

    @Column(name = "obj_size")
    private long size;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public byte[] getGetContents() {
        return getContents;
    }

    public void setGetContents(byte[] getContents) {
        this.getContents = getContents;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
    
    
}
