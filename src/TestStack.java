public class TestStack {
    public static void main(String[] args) {
        testGetLastItem();
        testGetLastUnchanged();
        testCopyStack();
        testReplaceItem();
    }

    public static void testGetLastItem() {
        // Setup
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Go through stack
        int last_item = -1;
        while (!stack.isEmpty()) {
            last_item = stack.pop();
        }

        System.out.println("testGetLastItem results:");
        System.out.printf("Last item: %d\n", last_item);
    }

    public static void testGetLastUnchanged() {
        // Setup
        MyStack stack = new MyStack();
        MyStack tempStack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Move items to tempStack
        int last_item = -1;
        while (!stack.isEmpty()) {
            last_item = stack.pop();
            tempStack.push(last_item);
        }
        // Move items back
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        System.out.println("testGetLastUnchanged results:");
        System.out.printf("Last item: %d\n", last_item);
        stack.displayContents();
    }

    public static void testCopyStack() {
        // Setup
        MyStack originalStack = new MyStack();
        MyStack copiedStack = new MyStack();
        MyStack tempStack = new MyStack();
        originalStack.push(1);
        originalStack.push(2);
        originalStack.push(3);

        // Move items to tempStack
        while (!originalStack.isEmpty()) {
            tempStack.push(originalStack.pop());
        }
        // Move items back
        while (!tempStack.isEmpty()) {
            int item = tempStack.pop();
            originalStack.push(item);
            copiedStack.push(item);
        }

        System.out.println("testCopyStack results:");
        originalStack.displayContents();
        copiedStack.displayContents();
    }

    public static void testReplaceItem() {
        // Setup
        MyStack stack = new MyStack();
        MyStack tempStack = new MyStack();
        int search = 2, replace = 5;

        stack.push(1);
        stack.push(2);
        stack.push(3);
        // Move items to tempStack
        while (!stack.isEmpty()) {
            int item = stack.pop();
            if (item == search) {
                item = replace;
            }
            tempStack.push(item);
        }
        // Move items back
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        System.out.println("testReplaceItem results:");
        stack.displayContents();
    }
}
