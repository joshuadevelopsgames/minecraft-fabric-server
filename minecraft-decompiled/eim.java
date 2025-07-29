import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eim {
   private Int2ObjectMap<bzm> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<bzm> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<bzm> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while ($$1.hasNext()) {
            Entry<bzm> $$0 = (Entry<bzm>)$$1.next();
            this.b.put($$0.getIntKey(), (bzm)$$0.getValue());
         }

         Int2ObjectMap<bzm> $$1x = this.a;
         this.a = this.b;
         this.b = $$1x;
      }
   }

   public void a(bzm $$0) {
      this.a();
      this.a.put($$0.ar(), $$0);
   }

   public void b(bzm $$0) {
      this.a();
      this.a.remove($$0.ar());
   }

   public boolean c(bzm $$0) {
      return this.a.containsKey($$0.ar());
   }

   public void a(Consumer<bzm> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while (var2.hasNext()) {
               bzm $$1 = (bzm)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }
      }
   }
}
