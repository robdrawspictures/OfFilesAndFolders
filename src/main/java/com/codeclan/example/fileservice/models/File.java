package com.codeclan.example.fileservice.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="files")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="type")
    private String type;

    @Column(name="size")
    private int size;

    @ManyToOne
    @JoinColumn(name="folder_id", nullable = false)
    private Folder folder;

    public File(String name, String type, int size, Folder folder) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.folder = folder;
    }

    public File(){

    }

    public Long getId() {
        return id;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
