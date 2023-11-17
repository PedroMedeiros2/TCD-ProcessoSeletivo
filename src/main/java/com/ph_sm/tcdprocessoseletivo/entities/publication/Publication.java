package com.ph_sm.tcdprocessoseletivo.entities.publication;

import com.ph_sm.tcdprocessoseletivo.entities.users.Credential;

import java.util.Date;

public class Publication {
    private long id;
    private String title;
    private String content;
    private Credential author;
    private Credential lastEditor;
    private Date publishDate;
    private Date editDate;
    private PublicationType type;
    private String attachmentLink; // Link to attached PDF (if applicable
}
