public class Bank {
    private String name;
    private Branch branch;
    
    public Bank() {
        this.name = "";
        this.branch= null;
    }

    public Bank(String name, Branch branch) {
        this.name = name;
        this.branch = branch;
    }
    
    public void setName(String newName)
    {
        this.name = newName;
    }

    public void setBranch(Branch newBranch)
    {
        this.branch = newBranch;
    }

    public String getName()
    {
        return name;
    }

    public String getBranch()
    {
        return branch;
    }

    public String toString() {
        return "Name: " + name + " | Branch: " + branch;
    }
}
