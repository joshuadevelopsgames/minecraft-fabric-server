import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public interface fjw {
   String cK = "*";
   fjw cL = new fjw() {
      @Override
      public String cM() {
         return "*";
      }
   };

   String cM();

   @Nullable
   default xo Q_() {
      return null;
   }

   default xo ht() {
      xo $$0 = this.Q_();
      return $$0 != null ? $$0.f().a($$0x -> $$0x.a(new xu.e(xo.b(this.cM())))) : xo.b(this.cM());
   }

   static fjw c(final String $$0) {
      if ($$0.equals("*")) {
         return cL;
      } else {
         final xo $$1 = xo.b($$0);
         return new fjw() {
            @Override
            public String cM() {
               return $$0;
            }

            @Override
            public xo ht() {
               return $$1;
            }
         };
      }
   }

   static fjw a(GameProfile $$0) {
      final String $$1 = $$0.getName();
      return new fjw() {
         @Override
         public String cM() {
            return $$1;
         }
      };
   }
}
