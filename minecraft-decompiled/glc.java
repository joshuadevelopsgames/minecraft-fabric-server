import com.google.common.collect.Lists;
import java.util.List;

public class glc implements gle {
   private static final xo a = xo.c("spectatorMenu.root.prompt");
   private final List<glf> b = Lists.newArrayList();

   public glc() {
      this.b.add(new gli());
      this.b.add(new glj());
   }

   @Override
   public List<glf> a() {
      return this.b;
   }

   @Override
   public xo b() {
      return a;
   }
}
