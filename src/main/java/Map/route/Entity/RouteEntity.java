package Map.route.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "route")
public class RouteEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "fileName")
	private String fileName;
	
	@Column(name = "fileType")
	private String fileType;
	
	@Lob
	@Column(name = "file")
	private byte[] file;
	
	public RouteEntity( String fileName, String fileType, byte[] file) {
		super();
		
		this.fileName = fileName;
		this.fileType = fileType;
		this.file = file;
	
	}
	public RouteEntity( ) {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}	
}