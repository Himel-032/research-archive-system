public class Author implements ResearchPaper{
    public String name;
   public FullResearchPaper paper;

    
    public Author(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return name;
    }

    @Override
    public void view(){
        if(paper != null){
            System.out.println("Title: " + paper.title);
            System.out.println("Author: " + paper.author);
            System.out.println("Content: " + paper.content);
        } else {
            System.out.println("No paper available to view.");
        }
    }
}
