package com.ph_sm.tcdprocessoseletivo.entities.publication;

import com.ph_sm.tcdprocessoseletivo.entities.users.Credential;
import com.ph_sm.tcdprocessoseletivo.entities.users.Editor;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Publication {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String content;
    @OneToOne
    private Editor author;
    @OneToOne
    private Editor lastEditor;
    private Date publishDate;
    private Date editDate;
    @Enumerated(EnumType.STRING)
    private PublicationType type;
}
