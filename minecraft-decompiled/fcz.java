import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.DataResult.Error;
import com.mojang.serialization.DataResult.Success;
import javax.annotation.Nullable;

public class fcz implements fdc {
   private final bci a;
   private final DynamicOps<vi> b;
   private final ui c;

   fcz(bci $$0, DynamicOps<vi> $$1, ui $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static fcz a(bci $$0, jn.a $$1) {
      return new fcz($$0, $$1.a(uw.a), new ui());
   }

   public static fcz a(bci $$0) {
      return new fcz($$0, uw.a, new ui());
   }

   @Override
   public <T> void a(String $$0, Codec<T> $$1, T $$2) {
      switch ($$1.encodeStart(this.b, $$2)) {
         case Success<vi> $$3:
            this.c.a($$0, (vi)$$3.value());
            break;
         case Error<vi> $$4:
            this.a.a(new fcz.a($$0, $$2, $$4));
            $$4.partialValue().ifPresent($$1x -> this.c.a($$0, $$1x));
            break;
         default:
            throw new MatchException(null, null);
      }
   }

   @Override
   public <T> void b(String $$0, Codec<T> $$1, @Nullable T $$2) {
      if ($$2 != null) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   public <T> void a(MapCodec<T> $$0, T $$1) {
      switch ($$0.encoder().encodeStart(this.b, $$1)) {
         case Success<vi> $$2:
            this.c.a((ui)$$2.value());
            break;
         case Error<vi> $$3:
            this.a.a(new fcz.c($$1, $$3));
            $$3.partialValue().ifPresent($$0x -> this.c.a((ui)$$0x));
            break;
         default:
            throw new MatchException(null, null);
      }
   }

   @Override
   public void a(String $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   @Override
   public void a(String $$0, byte $$1) {
      this.c.a($$0, $$1);
   }

   @Override
   public void a(String $$0, short $$1) {
      this.c.a($$0, $$1);
   }

   @Override
   public void a(String $$0, int $$1) {
      this.c.a($$0, $$1);
   }

   @Override
   public void a(String $$0, long $$1) {
      this.c.a($$0, $$1);
   }

   @Override
   public void a(String $$0, float $$1) {
      this.c.a($$0, $$1);
   }

   @Override
   public void a(String $$0, double $$1) {
      this.c.a($$0, $$1);
   }

   @Override
   public void a(String $$0, String $$1) {
      this.c.a($$0, $$1);
   }

   @Override
   public void a(String $$0, int[] $$1) {
      this.c.a($$0, $$1);
   }

   private bci d(String $$0) {
      return this.a.a(new bci.c($$0));
   }

   @Override
   public fdc a(String $$0) {
      ui $$1 = new ui();
      this.c.a($$0, $$1);
      return new fcz(this.d($$0), this.b, $$1);
   }

   @Override
   public fdc.b b(String $$0) {
      uo $$1 = new uo();
      this.c.a($$0, $$1);
      return new fcz.d($$0, this.a, this.b, $$1);
   }

   @Override
   public <T> fdc.a<T> a(String $$0, Codec<T> $$1) {
      uo $$2 = new uo();
      this.c.a($$0, $$2);
      return new fcz.e<>(this.a, $$0, this.b, $$1, $$2);
   }

   @Override
   public void c(String $$0) {
      this.c.r($$0);
   }

   @Override
   public boolean a() {
      return this.c.j();
   }

   public ui b() {
      return this.c;
   }

   public record a(String a, Object b, Error<?> c) implements bci.g {
      @Override
      public String a() {
         return "Failed to encode value '" + this.b + "' to field '" + this.a + "': " + this.c.message();
      }

      public String b() {
         return this.a;
      }

      public Object c() {
         return this.b;
      }

      public Error<?> d() {
         return this.c;
      }
   }

   public record b(String a, Object b, Error<?> c) implements bci.g {
      @Override
      public String a() {
         return "Failed to append value '" + this.b + "' to list '" + this.a + "': " + this.c.message();
      }

      public String b() {
         return this.a;
      }

      public Object c() {
         return this.b;
      }

      public Error<?> d() {
         return this.c;
      }
   }

   public record c(Object a, Error<?> b) implements bci.g {
      @Override
      public String a() {
         return "Failed to merge value '" + this.a + "' to an object: " + this.b.message();
      }

      public Object b() {
         return this.a;
      }

      public Error<?> c() {
         return this.b;
      }
   }

   static class d implements fdc.b {
      private final String a;
      private final bci b;
      private final DynamicOps<vi> c;
      private final uo d;

      d(String $$0, bci $$1, DynamicOps<vi> $$2, uo $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public fdc a() {
         int $$0 = this.d.size();
         ui $$1 = new ui();
         this.d.add($$1);
         return new fcz(this.b.a(new bci.d(this.a, $$0)), this.c, $$1);
      }

      @Override
      public void b() {
         this.d.removeLast();
      }

      @Override
      public boolean c() {
         return this.d.isEmpty();
      }
   }

   static class e<T> implements fdc.a<T> {
      private final bci a;
      private final String b;
      private final DynamicOps<vi> c;
      private final Codec<T> d;
      private final uo e;

      e(bci $$0, String $$1, DynamicOps<vi> $$2, Codec<T> $$3, uo $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public void a(T $$0) {
         switch (this.d.encodeStart(this.c, $$0)) {
            case Success<vi> $$1:
               this.e.add((vi)$$1.value());
               break;
            case Error<vi> $$2:
               this.a.a(new fcz.b(this.b, $$0, $$2));
               $$2.partialValue().ifPresent(this.e::add);
               break;
            default:
               throw new MatchException(null, null);
         }
      }

      @Override
      public boolean a() {
         return this.e.isEmpty();
      }
   }
}
