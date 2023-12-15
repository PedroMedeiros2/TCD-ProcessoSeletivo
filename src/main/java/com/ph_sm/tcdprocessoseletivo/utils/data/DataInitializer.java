package com.ph_sm.tcdprocessoseletivo.utils.data;

import com.ph_sm.tcdprocessoseletivo.entities.announcement.Announcement;
import com.ph_sm.tcdprocessoseletivo.entities.announcement.Rectification;
import com.ph_sm.tcdprocessoseletivo.entities.credential.Credential;
import com.ph_sm.tcdprocessoseletivo.entities.publication.Publication;
import com.ph_sm.tcdprocessoseletivo.entities.publication.PublicationType;
import com.ph_sm.tcdprocessoseletivo.entities.selectionprocess.Application;
import com.ph_sm.tcdprocessoseletivo.entities.selectionprocess.SelectionProcess;
import com.ph_sm.tcdprocessoseletivo.entities.selectionprocess.StatusSelectionProcess;
import com.ph_sm.tcdprocessoseletivo.entities.users.Role;
import com.ph_sm.tcdprocessoseletivo.entities.users.User;
import com.ph_sm.tcdprocessoseletivo.services.announcement.AnnouncementServiceLocal;
import com.ph_sm.tcdprocessoseletivo.services.announcement.RectificationServiceLocal;
import com.ph_sm.tcdprocessoseletivo.services.publication.PublicationServiceLocal;
import com.ph_sm.tcdprocessoseletivo.services.selectionprocess.ApplicationServiceLocal;
import com.ph_sm.tcdprocessoseletivo.services.selectionprocess.SelectionProcessService;
import com.ph_sm.tcdprocessoseletivo.services.selectionprocess.SelectionProcessServiceLocal;
import com.ph_sm.tcdprocessoseletivo.services.users.UserServiceLocal;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import java.time.LocalDate;

@Startup
@Singleton
public class DataInitializer implements DataInitializerLocal {


    @Inject
    private UserServiceLocal userService;

    @Inject
    private SelectionProcessServiceLocal selectionProcessService;

    @Inject
    private AnnouncementServiceLocal announcementService;

    @Inject
    private RectificationServiceLocal rectificationService;

    @Inject
    private ApplicationServiceLocal applicationService;

    @Inject
    private PublicationServiceLocal publicationService;


    @PostConstruct
    @Override
    public void init() {

        //<editor-fold defaultstate="collapsed" desc="Users">

        //<editor-fold defaultstate="collapsed" desc="User ADM">
        User user1 = new User();
        user1.setName("Singed");
        user1.setBirthDate(LocalDate.of(1990, 1, 1));
        user1.setCpf("12345678900");
        user1.setRole(Role.ADM);

        Credential credential = new Credential();
        credential.setEmail("singed@example.com");
        credential.setPassword("123456");

        user1.setCredential(credential);

        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="User Editor">
        User user2 = new User();
        user2.setName("Captain Teemo");
        user2.setBirthDate(LocalDate.of(1990, 1, 1));
        user2.setCpf("12345678901");
        user2.setRole(Role.EDITOR);

        Credential credential2 = new Credential();
        credential2.setEmail("teemo@exemple.com");
        credential2.setPassword("teemo123");

        user2.setCredential(credential2);

        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="User Candidate">
        User user3 = new User();
        user3.setName("Caitlyn");
        user3.setBirthDate(LocalDate.of(1999, 1, 1));
        user3.setCpf("12345678902");
        user3.setRole(Role.CANDIDATE);

        Credential credential3 = new Credential();
        credential3.setEmail("caitlyn@exemple.com");
        credential3.setPassword("@Vi6969");

        user3.setCredential(credential3);

        //</editor-fold>

        userService.persist(user1);
        userService.persist(user2);
        userService.persist(user3);
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Selection Process">

        SelectionProcess selectionProcess1 = new SelectionProcess();
        selectionProcess1.setStartDate(LocalDate.of(2021, 1, 1));
        selectionProcess1.setEndDate(LocalDate.of(2021, 1, 31));
        selectionProcess1.setTitle("Selection Process 1");
        selectionProcess1.setStatus(StatusSelectionProcess.CLOSED);

        Announcement announcement1 = new Announcement();
        announcement1.setNumber(15);
        announcement1.setDescription("Description 1");
        announcement1.setPublicationDate(LocalDate.of(2021, 1, 1));
        announcement1.setLink("https://www.example.com/announcement1");
        announcement1.setSelectionProcess(selectionProcess1);

        selectionProcess1.setAnnouncement(announcement1);

        Rectification rectification1 = new Rectification();
        rectification1.setAnnouncement(announcement1);
        rectification1.setDescription("Rectification 1");
        rectification1.setPublicationDate(LocalDate.of(2021, 1, 29));
        rectification1.setLink("https://www.example.com/rectification1");

        rectificationService.persist(rectification1);
        announcementService.persist(announcement1);
        selectionProcessService.persist(selectionProcess1);
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Application User in Selection Process">
        Application application1 = new Application();
        application1.setCandidate(user3);
        application1.setSelectionProcess(selectionProcess1);
        application1.setApplicationDate(LocalDate.of(2021, 1, 5));

        applicationService.persist(application1);
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Publication">
        Publication publication1 = new Publication();
        publication1.setAuthor(user2);
        publication1.setContent("Publication 1 is a news");
        publication1.setType(PublicationType.NEWS);
        publication1.setTitle("Publication 1");

        publicationService.persist(publication1);
        //</editor-fold>


    }
}
