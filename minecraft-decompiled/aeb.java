import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class aeb {
   private static final zm<ByteBuf, Map<eka.a, long[]>> a = zk.a($$0 -> new EnumMap<>(eka.a.class), eka.a.h, zk.o);
   private static final int b = 2097152;
   private final Map<eka.a, long[]> c;
   private final byte[] d;
   private final List<aeb.a> e;

   public aeb(egi $$0) {
      this.c = $$0.e()
         .stream()
         .filter($$0x -> ((eka.a)$$0x.getKey()).b())
         .collect(Collectors.toMap(Entry::getKey, $$0x -> (long[])((eka)$$0x.getValue()).a().clone()));
      this.d = new byte[a($$0)];
      a(new wg(this.c()), $$0);
      this.e = Lists.newArrayList();

      for (Entry<jb, eaz> $$1 : $$0.J().entrySet()) {
         this.e.add(aeb.a.a($$1.getValue()));
      }
   }

   public aeb(wx $$0, int $$1, int $$2) {
      this.c = a.decode($$0);
      int $$3 = $$0.l();
      if ($$3 > 2097152) {
         throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
      } else {
         this.d = new byte[$$3];
         $$0.b(this.d);
         this.e = aeb.a.b.decode($$0);
      }
   }

   public void a(wx $$0) {
      a.encode($$0, this.c);
      $$0.c(this.d.length);
      $$0.c(this.d);
      aeb.a.b.encode($$0, this.e);
   }

   private static int a(egi $$0) {
      int $$1 = 0;

      for (egj $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.d);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(wg $$0, egi $$1) {
      for (egj $$2 : $$1.d()) {
         $$2.c($$0);
      }

      if ($$0.writerIndex() != $$0.capacity()) {
         throw new IllegalStateException("Didn't fill chunk buffer: expected " + $$0.capacity() + " bytes, got " + $$0.writerIndex());
      }
   }

   public Consumer<aeb.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(aeb.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      jb.a $$5 = new jb.a();

      for (aeb.a $$6 : this.e) {
         int $$7 = $$3 + ke.b($$6.c >> 4);
         int $$8 = $$4 + ke.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public wg a() {
      return new wg(Unpooled.wrappedBuffer(this.d));
   }

   public Map<eka.a, long[]> b() {
      return this.c;
   }

   static class a {
      public static final zm<wx, aeb.a> a = zm.a(aeb.a::a, aeb.a::new);
      public static final zm<wx, List<aeb.a>> b = a.a(zk.a());
      final int c;
      final int d;
      final ebb<?> e;
      @Nullable
      final ui f;

      private a(int $$0, int $$1, ebb<?> $$2, @Nullable ui $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(wx $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = zk.a(mn.e).decode($$0);
         this.f = $$0.o();
      }

      private void a(wx $$0) {
         $$0.l(this.c);
         $$0.m(this.d);
         zk.a(mn.e).encode($$0, this.e);
         $$0.a(this.f);
      }

      static aeb.a a(eaz $$0) {
         ui $$1 = $$0.a($$0.i().K_());
         jb $$2 = $$0.aA_();
         int $$3 = ke.b($$2.u()) << 4 | ke.b($$2.w());
         return new aeb.a($$3, $$2.v(), $$0.q(), $$1.j() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(jb var1, ebb<?> var2, @Nullable ui var3);
   }
}
