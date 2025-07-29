public interface gbz {
   gcb a();

   public record a(gcb a) implements gbz {
      @Override
      public gcb a() {
         return this.a.a() == gca.b ? this.a : gcb.b;
      }

      public gcb b() {
         return this.a;
      }
   }

   public static class b implements gbz {
      @Override
      public gcb a() {
         return gcb.b;
      }
   }

   public record c(boolean a) implements gbz {
      @Override
      public gcb a() {
         return this.a ? gcb.b : gcb.a;
      }

      public boolean b() {
         return this.a;
      }
   }
}
