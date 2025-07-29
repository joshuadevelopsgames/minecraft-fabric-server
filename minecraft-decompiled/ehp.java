import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class ehp implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<eho> c = new Long2ObjectLinkedOpenHashMap();
   private final ehr d;
   private final Path e;
   private final boolean f;

   ehp(ehr $$0, Path $$1, boolean $$2) {
      this.e = $$1;
      this.f = $$2;
      this.d = $$0;
   }

   private eho b(dlz $$0) throws IOException {
      long $$1 = dlz.c($$0.h(), $$0.i());
      eho $$2 = (eho)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((eho)this.c.removeLast()).close();
         }

         w.c(this.e);
         Path $$3 = this.e.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         eho $$4 = new eho(this.d, $$3, this.e, this.f);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public ui a(dlz $$0) throws IOException {
      eho $$1 = this.b($$0);

      ui var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = uv.a($$2);
      }

      return var4;
   }

   public void a(dlz $$0, vf $$1) throws IOException {
      eho $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            uv.a((DataInput)$$3, $$1, ur.a());
         }
      }
   }

   protected void a(dlz $$0, @Nullable ui $$1) throws IOException {
      eho $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            uv.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      bbh<IOException> $$0 = new bbh<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         eho $$1 = (eho)var2.next();

         try {
            $$1.close();
         } catch (IOException var5) {
            $$0.a(var5);
         }
      }

      $$0.a();
   }

   public void a() throws IOException {
      ObjectIterator var1 = this.c.values().iterator();

      while (var1.hasNext()) {
         eho $$0 = (eho)var1.next();
         $$0.b();
      }
   }

   public ehr b() {
      return this.d;
   }
}
