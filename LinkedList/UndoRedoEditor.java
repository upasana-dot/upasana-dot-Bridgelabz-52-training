package LinkedList;

class State {

    String text;

    State prev;
    State next;

    State(String text) {
        this.text = text;
    }
}

class TextEditor {

    State current;

    void type(String newText) {

        State newState = new State(newText);

        if (current != null) {
            current.next = newState;
            newState.prev = current;
        }

        current = newState;
    }

    void undo() {

        if (current.prev != null)
            current = current.prev;

        System.out.println("Undo -> " + current.text);
    }

    void redo() {

        if (current.next != null)
            current = current.next;

        System.out.println("Redo -> " + current.text);
    }

    void display() {

        System.out.println("Current Text: " + current.text);
    }
}

public class UndoRedoEditor {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.type("Hello");
        editor.type("Hello World");
        editor.type("Hello World!!!");

        editor.display();

        editor.undo();
        editor.undo();

        editor.redo();
    }
}
