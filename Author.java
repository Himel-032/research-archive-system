public class Author implements ResearchPaper{
   public FullResearchPaper paper;
   public int publicationYear;
   public void setPublicationYear(int year){
       this.publicationYear = year;
   }

   public int getPublicationYear(){
       return publicationYear;
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
