package PersonalisedMarketting.PersonalisedMarketting.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "project_id")
    private Long id;

    @Column(name= "project_name")
    private String projectName;


    public Project() {
    }

    public Project(String projectName) {
        this.projectName = projectName;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    // Additional getters and setters for other fields

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                // Include other fields in the toString if needed
                '}';
    }
}
