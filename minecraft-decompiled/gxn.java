import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface gxn {
   static gxn.a a(foa $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static gxn.a a(SequencedMap<gxz, foa> $$0, foa $$1) {
      return new gxn.a($$1, $$0);
   }

   fog getBuffer(gxz var1);

   public static class a implements gxn {
      protected final foa a;
      protected final SequencedMap<gxz, foa> b;
      protected final Map<gxz, fnz> c = new HashMap<>();
      @Nullable
      protected gxz d;

      protected a(foa $$0, SequencedMap<gxz, foa> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fog getBuffer(gxz $$0) {
         fnz $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.K()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            foa $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new fnz($$2, $$0.G(), $$0.F());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new fnz(this.a, $$0.G(), $$0.F());
               this.d = $$0;
            }

            this.c.put($$0, $$1);
            return $$1;
         }
      }

      public void a() {
         if (this.d != null) {
            this.a(this.d);
            this.d = null;
         }
      }

      public void b() {
         this.a();

         for (gxz $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gxz $$0) {
         fnz $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(gxz $$0, fnz $$1) {
         foc $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.L()) {
               foa $$3 = this.b.getOrDefault($$0, this.a);
               $$2.a($$3, RenderSystem.getProjectionType().a());
            }

            $$0.a($$2);
         }

         if ($$0.equals(this.d)) {
            this.d = null;
         }
      }
   }
}
