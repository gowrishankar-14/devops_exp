@Override
public void perform(Run<?, ?> run, FilePath workspace, Launcher launcher, TaskListener listener)
     PrintStream outOriginal = System.out;
     PrintStream errOriginal = System.err;
     try {
        System.setOut(listener.getLogger());
        System.setErr(listener.getLogger());
        System.out.println("Testing System.out");
        // Call your code that writes to System.out by default
     } finally {
        System.setOut(outOriginal);
        System.setErr(errOriginal);
     }
}
