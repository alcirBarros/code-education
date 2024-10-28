package br.com.driver.controller;

import br.com.context.model.driver.DriverEntity;
import br.com.context.model.driver.ObjectEntity;
import br.com.context.model.driver.UploadedEntity;
import br.com.service.driver.DriverService;
import br.com.service.driver.UploadedService;
import br.com.template.controller.AbstractMb;
import br.com.template.scoped.ConfigurableBeanFactory;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.FileUploadEvent;

import org.primefaces.model.file.UploadedFile;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(ConfigurableBeanFactory.SCOPE_SESSION)
public class DriverMb extends AbstractMb {

    @Autowired
    private DriverService driverService;
    @Autowired
    private UploadedService uploadedService;

    private List<DriverEntity> driverList;

    private UploadedFile file;

    private UploadedEntity uploaded = new UploadedEntity();

    @PostConstruct
    public void init() {
        driverList = driverService.findAll();
    }

    @Override
    public void carregarTela() {

    }

    @Override
    public void salvar() {
        uploadedService.save(uploaded);
    }

    @Override
    public void inserir() {
        modoTela.mudarParaInsercao();
    }

    @Override
    public void alterar() {
        modoTela.mudarParaAlteracao();
    }

    @Override
    public void excluir() {
        modoTela.mudarParaLocalizacao();
    }

    @Override
    public void cancelar() {
        modoTela.mudarParaLocalizacao();
    }

    public void uploadMultiple() {

    }

    public void upload(FileUploadEvent event) {
        try {
            UploadedFile uploadedFile = event.getFile();

            String fileName = uploadedFile.getFileName();
            String contentType = uploadedFile.getContentType();
       //     byte[] contents = uploadedFile.getContents();
            long size = uploadedFile.getSize();

            ObjectEntity objeto = new ObjectEntity();
            objeto.setFileName(fileName);
            objeto.setFileType(contentType);
          //  objeto.setGetContents(contents);
            objeto.setSize(size);

            uploaded.adicionar(objeto);

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Upload completo", "O arquivo " + uploadedFile.getFileName()));
        } catch (Exception e) {
            e.printStackTrace();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Erro", e.getMessage()));
        }
    }

    public void valueChangeListener(Object object) {
        System.out.println(object);
    }

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public UploadedEntity getUploaded() {
        return uploaded;
    }

    public void setUploaded(UploadedEntity uploaded) {
        this.uploaded = uploaded;
    }

    public List<DriverEntity> getDriverList() {
        return driverList;
    }
}
