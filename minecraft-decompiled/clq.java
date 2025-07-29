import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public class clq {
   private final jb a;
   private final jl<cls> b;
   private int c;
   private final Runnable d;

   clq(jb $$0, jl<cls> $$1, int $$2, Runnable $$3) {
      this.a = $$0.j();
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public clq(jb $$0, jl<cls> $$1, Runnable $$2) {
      this($$0, $$1, $$1.a().b(), $$2);
   }

   public clq.a a() {
      return new clq.a(this.a, this.b, this.c);
   }

   @Deprecated
   @bdl
   public int b() {
      return this.c;
   }

   protected boolean c() {
      if (this.c <= 0) {
         return false;
      } else {
         this.c--;
         this.d.run();
         return true;
      }
   }

   protected boolean d() {
      if (this.c >= this.b.a().b()) {
         return false;
      } else {
         this.c++;
         this.d.run();
         return true;
      }
   }

   public boolean e() {
      return this.c > 0;
   }

   public boolean f() {
      return this.c != this.b.a().b();
   }

   public jb g() {
      return this.a;
   }

   public jl<cls> h() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Objects.equals(this.a, ((clq)$$0).a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   public record a(jb b, jl<cls> c, int d) {
      public static final Codec<clq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               jb.a.fieldOf("pos").forGetter(clq.a::a),
               amb.a(mn.ad).fieldOf("type").forGetter(clq.a::b),
               Codec.INT.fieldOf("free_tickets").orElse(0).forGetter(clq.a::c)
            )
            .apply($$0, clq.a::new)
      );

      public clq a(Runnable $$0) {
         return new clq(this.b, this.c, this.d, $$0);
      }

      public jb a() {
         return this.b;
      }

      public jl<cls> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
