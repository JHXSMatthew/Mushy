package constants;

/**
 *
 * @author MechAviv
 */
public class SkillConstants {
    public static boolean is_skill_need_master_level(int nSkillID) {
        if (is_ignore_master_level(nSkillID)
         || nSkillID / 1000000 == 92 && (nSkillID % 10000) < 0
         || is_making_skill_recipe(nSkillID)
         || is_common_skill(nSkillID)
         || is_novice_skill(nSkillID)
         || is_field_attack_obj_skill(nSkillID)) {
            return false;
        } else {
            int nJob = nSkillID / 10000 == 8000 ? nSkillID / 100 : nSkillID / 10000;
            return nSkillID != 42120024
                    && !is_beasttamer_job(nJob)
                    && !(nJob >= 40000 && nJob <= 40005)
                    && (is_added_sp_dual_and_zero_skill(nSkillID)|| get_job_level(nJob) == 4 && !is_zero_job(nJob));
        }
    }
    
    public static boolean is_ignore_master_level(int nSkillID) {
        switch (nSkillID) {
            case 51120000:
            case 35120014:
            case 33120010:
            case 23121008:
            case 23120013:
            case 23120011:
            case 22171070:
            case 21121008:
            case 21120021:
            case 21120020:
            case 21120014:
            case 21120007:
            case 5321006:
            case 5321004:
            case 5320007:
            case 5221022:
            case 5220014:
            case 5220012:
            case 5120012:
            case 5120011:
            case 4340012:
            case 4340010:
            case 4210012:
            case 4110012:
            case 3210015:
            case 2321010:
            case 2221009:
            case 2121009:
            case 1320011:
            case 1120012:
                return true;
        }
        return false;
    }
    
    public static boolean is_making_skill_recipe(int nSkillID) {
        if (nSkillID / 1000000 != 92 || nSkillID % 10000 > 1) {
            int v1 = 10000 * (nSkillID / 10000);
            if (v1 / 1000000 == 92 && (v1 % 10000) < 1) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean is_common_skill(int nSkillID) {
        int nJob = nSkillID / 10000 == 8000 ? nSkillID / 100 : nSkillID / 10000;
        if (nJob < 800000 || nJob > 800099) {
            return nJob == 8001;
        } else {
            return true;
        }
    }
    
    public static boolean is_beginner_job(int nJob) {
        switch (nJob) {
            case 2002:
            case 2003:
            case 2004:
            case 2005:
            case 3001:
            case 3002:
            case 4001:
            case 4002:
            case 5000:
            case 6000:
            case 6001:
            case 8001:
            case 13000:
            case 14000:
                return true;
        }
        return false;
    }
    
    public static boolean is_novice_skill(int nSkillID) {
        int nJob = nSkillID / 10000 == 8000 ? nSkillID / 100 : nSkillID / 10000;
        if (nJob < 40000 || nJob > 40005) {
            return is_beginner_job(nJob);
        } else {
            return false;
        }
    }
    
    public static boolean is_field_attack_obj_skill(int nSkillID) {
        int nJob = nSkillID / 10000 == 8000 ? nSkillID / 100 : nSkillID / 10000;
        return nJob == 9500;
    }
    
    public static boolean is_beasttamer_job(int nJob) {
        return nJob / 100 == 112 || nJob == 11000;
    }
    
    public static boolean is_added_sp_dual_and_zero_skill(int nSkillID) {
        switch (nSkillID) {
          case 101120104:
          case 101110203:
          case 101110200:
          case 101110102:
          case 101100201:
          case 101100101:
          case 101000101:
          case 4341004:
          case 4340007:
          case 4331002:
          case 4330009:
          case 4321006:
          case 4311003:  
              return true;
        }
        return false;
    }
    
    public static int get_job_level(int nJob) { 
        int result, v2;
        if (is_beginner_job(nJob) || (nJob % 100) < 0 || nJob == 501 || nJob == 3101 || nJob == 508) {
            result = 1;
        } else if (is_evan_job(nJob)) {
            result = get_evan_job_level(nJob);
        } else {
            if (nJob / 10 == 43)
                v2 = nJob % 10 / 2;
            else
                v2 = nJob % 10;
            result = v2 <= 2 ? v2 + 2 : 0;
        }
        return result;
    }
    
    public static int get_evan_job_level(int nJob) {
        switch (nJob) {
            case 2200:
            case 2210:
              return 1;
            case 2211:
            case 2212:
            case 2213:
              return 2;
            case 2214:
            case 2215:
            case 2216:
              return 3;
            case 2217:
            case 2218:
              return 4;
            default:
              return 0;
        }
    }
    
    public static boolean is_evan_job(int nJob) {
        return nJob / 100 == 22 || nJob == 2001;
    }
    
    public static boolean is_zero_job(int nJob) {
        return nJob == 10000 || nJob == 10100 || nJob == 10110 || nJob == 10111 || nJob == 10112;
    }
}
