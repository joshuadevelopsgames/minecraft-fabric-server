import java.util.ArrayDeque;
import java.util.Deque;
import javax.annotation.Nullable;

public class vq implements vf {
   private final Deque<vq.b> a = new ArrayDeque<>();

   public vq() {
      this.a.addLast(new vq.d());
   }

   @Nullable
   public vi d() {
      return this.a.getFirst().a();
   }

   protected int e() {
      return this.a.size() - 1;
   }

   private void a(vi $$0) {
      this.a.getLast().a($$0);
   }

   @Override
   public vf.b a() {
      this.a(uk.b);
      return vf.b.a;
   }

   @Override
   public vf.b a(String $$0) {
      this.a(vg.a($$0));
      return vf.b.a;
   }

   @Override
   public vf.b a(byte $$0) {
      this.a(ug.a($$0));
      return vf.b.a;
   }

   @Override
   public vf.b a(short $$0) {
      this.a(vb.a($$0));
      return vf.b.a;
   }

   @Override
   public vf.b a(int $$0) {
      this.a(un.a($$0));
      return vf.b.a;
   }

   @Override
   public vf.b a(long $$0) {
      this.a(uq.a($$0));
      return vf.b.a;
   }

   @Override
   public vf.b a(float $$0) {
      this.a(ul.a($$0));
      return vf.b.a;
   }

   @Override
   public vf.b a(double $$0) {
      this.a(uj.a($$0));
      return vf.b.a;
   }

   @Override
   public vf.b a(byte[] $$0) {
      this.a(new uf($$0));
      return vf.b.a;
   }

   @Override
   public vf.b a(int[] $$0) {
      this.a(new um($$0));
      return vf.b.a;
   }

   @Override
   public vf.b a(long[] $$0) {
      this.a(new up($$0));
      return vf.b.a;
   }

   @Override
   public vf.b a(vk<?> $$0, int $$1) {
      return vf.b.a;
   }

   @Override
   public vf.a b(vk<?> $$0, int $$1) {
      this.c($$0);
      return vf.a.a;
   }

   @Override
   public vf.a a(vk<?> $$0) {
      return vf.a.a;
   }

   @Override
   public vf.a a(vk<?> $$0, String $$1) {
      this.a.getLast().a($$1);
      this.c($$0);
      return vf.a.a;
   }

   private void c(vk<?> $$0) {
      if ($$0 == uo.a) {
         this.a.addLast(new vq.c());
      } else if ($$0 == ui.b) {
         this.a.addLast(new vq.a());
      }
   }

   @Override
   public vf.b b() {
      vq.b $$0 = this.a.removeLast();
      vi $$1 = $$0.a();
      if ($$1 != null) {
         this.a.getLast().a($$1);
      }

      return vf.b.a;
   }

   @Override
   public vf.b b(vk<?> $$0) {
      this.c($$0);
      return vf.b.a;
   }

   static class a implements vq.b {
      private final ui a = new ui();
      private String b = "";

      @Override
      public void a(String $$0) {
         this.b = $$0;
      }

      @Override
      public void a(vi $$0) {
         this.a.a(this.b, $$0);
      }

      @Override
      public vi a() {
         return this.a;
      }
   }

   interface b {
      default void a(String $$0) {
      }

      void a(vi var1);

      @Nullable
      vi a();
   }

   static class c implements vq.b {
      private final uo a = new uo();

      @Override
      public void a(vi $$0) {
         this.a.a($$0);
      }

      @Override
      public vi a() {
         return this.a;
      }
   }

   static class d implements vq.b {
      @Nullable
      private vi a;

      @Override
      public void a(vi $$0) {
         this.a = $$0;
      }

      @Nullable
      @Override
      public vi a() {
         return this.a;
      }
   }
}
