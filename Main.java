public class Main {
    public static void main(String[] args) {
    ResearchPaper paper = new FullResearchPaper("Web", "Himel", "Hello world");

    ResearchPaper author = new Author("Ahsan");
    ((Author) author).paper = (FullResearchPaper) paper;

    author.view();
    paper.view();
    }
}
