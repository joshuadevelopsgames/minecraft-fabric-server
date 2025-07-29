public interface clm {
   clm a = a("zombie_villager_cured");
   clm b = a("golem_killed");
   clm c = a("villager_hurt");
   clm d = a("villager_killed");
   clm e = a("trade");

   static clm a(final String $$0) {
      return new clm() {
         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
