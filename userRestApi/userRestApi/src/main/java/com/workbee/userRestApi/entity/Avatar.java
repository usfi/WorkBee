package com.workbee.userRestApi.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.File;

@Entity
@Table(name = "avatars")
public class Avatar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Size(max = 40)
    private String name;



    private File file;
private String path;
    public Avatar(){

    }
    public Avatar(@Size(max = 40) String name,File file, String path) {
        this.name = name;
        this.file = file;
        this.path = path;
    }

    public Long getId() {
        return id;
    }

    public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
