package Behavior.visitor.file;

import java.lang.reflect.InvocationTargetException;

class FileSearchVisitor implements Visitor {
    private String searchFileName;
    private File foundFile;

    public FileSearchVisitor(String searchFileName) {
        this.searchFileName = searchFileName;
    }

    @Override
    public void visit(File file) {
        if (file.getName().equals(this.searchFileName)) {
            this.foundFile = file;
        }
    }

    @Override
    public void visit(Directory directory) {
        for (FileSystem element : directory.getElements()) {
            String elementName = null;
            try {
                elementName = element.getClass().
                        getMethod("getName").
                        invoke(element).toString();
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Search element: " + elementName);
            element.accept(this);
        }
    }

    public File getFoundFile() {
        return this.foundFile;
    }
}