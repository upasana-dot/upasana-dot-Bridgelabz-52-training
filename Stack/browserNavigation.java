package Stack;
import java.util.Stack;
public class browserNavigation {
    private shortStack backStack;
    private shortStack forwardStack;
    private String currentPage;

    public browserNavigation(int stackSize) {
        this.backStack = new shortStack(stackSize);
        this.forwardStack = new shortStack(stackSize);
        this.currentPage = "Home";
    }

    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage.hashCode());
            currentPage = String.valueOf(backStack.pop());
            System.out.println("Went back to: " + currentPage);
        } else {
            System.out.println("No pages in back history.");
        }
    }

    public void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage.hashCode());
            currentPage = String.valueOf(forwardStack.pop());
            System.out.println("Went forward to: " + currentPage);
        } else {
            System.out.println("No pages in forward history.");
        }
    }


    public String getCurrentPage() {
        return currentPage;
    }

    public static void main(String[] args) {
            browserNavigation browser = new browserNavigation(5);
            browser.forward();
            browser.back();
            browser.back();
            browser.forward();
            System.out.println("Current Page: " + browser.getCurrentPage());
            browser.forward();
            browser.back();
            browser.getCurrentPage();
            }
    
}
