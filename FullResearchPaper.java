import java.util.ArrayList;
import java.util.List;

public class FullResearchPaper implements ResearchPaper {
    public String title;
    public String author;
    public String content;
    public List<FullResearchPaper> papers = new ArrayList<>();
    

    public FullResearchPaper(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
        papers.add(this);
    }

    @Override
    public void view() {
        for(FullResearchPaper paper : papers){
            System.out.println("Title: " + paper.title);
            System.out.println("Author: " + paper.author);
            System.out.println("Content: " + paper.content);
            System.out.println("");
        }
    }
}