import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class frc implements Iterable<fpx> {
   private final fue a;
   private final Set<fpx> b = new HashSet<>();
   private List<fpx> c = List.of();

   public frc(fue $$0) {
      this.a = $$0;
   }

   public void a(List<fpx> $$0) {
      List<fpx> $$1 = new ArrayList<>($$0);
      $$1.sort(new fpx.b(this.a.Y().c()));
      boolean $$2 = $$1.removeAll(this.b);
      if (!$$2) {
         this.b.clear();
      }

      this.c = $$1;
   }

   public void a(fpx $$0) {
      this.c.remove($$0);
      this.b.add($$0);
   }

   @Override
   public Iterator<fpx> iterator() {
      return this.c.iterator();
   }

   public boolean a() {
      return this.c.isEmpty();
   }
}
