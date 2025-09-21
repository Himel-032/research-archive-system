public class Author implements ResearchPaper{
   public FullResearchPaper paper;
   public int publicationYearrr;
   public void setPublicationYear(int yearr){
       this.publicationYearrr = yearr;
   }

   public int getPublicationYear(){
       return publicationYearrr;
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
