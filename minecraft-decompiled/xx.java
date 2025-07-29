import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import javax.annotation.Nullable;

public class xx {
   private final int a;
   private final ObjectList<xy> b = new ObjectArrayList();
   @Nullable
   private ya c;

   public xx(int $$0) {
      this.a = $$0;

      for (int $$1 = 0; $$1 < $$0; $$1++) {
         this.b.add(null);
      }
   }

   public void a(ya $$0) {
      if (!$$0.equals(this.c)) {
         this.b.add(new xy($$0, true));
         this.c = $$0;
      }
   }

   public int a() {
      return this.b.size();
   }

   public void a(int $$0) throws xx.a {
      int $$1 = this.b.size() - this.a;
      if ($$0 >= 0 && $$0 <= $$1) {
         this.b.removeElements(0, $$0);
      } else {
         throw new xx.a("Advanced last seen window by " + $$0 + " messages, but expected at most " + $$1);
      }
   }

   public xv a(xv.b $$0) throws xx.a {
      this.a($$0.a());
      ObjectList<ya> $$1 = new ObjectArrayList($$0.b().cardinality());
      if ($$0.b().length() > this.a) {
         throw new xx.a("Last seen update contained " + $$0.b().length() + " messages, but maximum window size is " + this.a);
      } else {
         for (int $$2 = 0; $$2 < this.a; $$2++) {
            boolean $$3 = $$0.b().get($$2);
            xy $$4 = (xy)this.b.get($$2);
            if ($$3) {
               if ($$4 == null) {
                  throw new xx.a("Last seen update acknowledged unknown or previously ignored message at index " + $$2);
               }

               this.b.set($$2, $$4.a());
               $$1.add($$4.b());
            } else {
               if ($$4 != null && !$$4.c()) {
                  throw new xx.a("Last seen update ignored previously acknowledged message at index " + $$2 + " and signature " + $$4.b());
               }

               this.b.set($$2, null);
            }
         }

         xv $$5 = new xv($$1);
         if (!$$0.a($$5)) {
            throw new xx.a("Checksum mismatch on last seen update: the client and server must have desynced");
         } else {
            return $$5;
         }
      }
   }

   public static class a extends Exception {
      public a(String $$0) {
         super($$0);
      }
   }
}
