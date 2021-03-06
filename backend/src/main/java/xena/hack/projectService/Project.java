package xena.hack.projectService;

/**
 * Created by courtneydavis on 7/9/17.
 */


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "projects")
public class Project {

    @Id
    public String id;

    public String title;
    public String githubUrl;
    public List<String> tags;
    public String description;


    public Project(){}

    public Project(String title, String githubUrl, List<String> tags, String description){
        this.title = title;
        this.githubUrl = githubUrl;
        this.tags = tags;
        this.description = description;

    }

    @Override
    public String toString() {
        return String.format(
                "Project[id=%s, title='%s', githubUrl='%s', tags='%s]",
                id, title, githubUrl, tags);
    }
}
