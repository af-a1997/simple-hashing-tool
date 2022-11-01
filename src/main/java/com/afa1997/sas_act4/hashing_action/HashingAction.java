package com.afa1997.sas_act4.hashing_action;

import java.util.ArrayList;
import java.util.List;

// Guava libraries for hashing
import com.google.common.base.Charsets;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;

public class HashingAction {
    static List<String> rcv_sa = new ArrayList<>();
    static String rcv_in_text = new String();
    
    public HashingAction(List<String> selected_actions, String in_text){
        rcv_sa = selected_actions;
        rcv_in_text = in_text;
    }
    public List<String[]> HA_GetHashedString(){
        List<String[]> finished_hashing_list = new ArrayList<>();
        //HashCode hc_testing = Hashing.
        
        for (String current_ha : rcv_sa) {
            switch (current_ha) {
                case "Adler-32":
                    {
                        HashCode hc_adler32 = Hashing.adler32().newHasher().putString(rcv_in_text, Charsets.UTF_8).hash();
                        
                        String[] adler32_entry = {"Adler-32", hc_adler32.toString()};
                        finished_hashing_list.add(adler32_entry);
                        
                        break;
                    }
                case "CRC-32":
                    {
                        HashCode hc_crc32 = Hashing.crc32().newHasher().putString(rcv_in_text, Charsets.UTF_8).hash();
                        
                        String[] crc32_entry = {"CRC-32", hc_crc32.toString()};
                        finished_hashing_list.add(crc32_entry);
                        
                        break;
                    }
                case "MD5":
                    {
                        HashCode hc_md5 = Hashing.md5().newHasher().putString(rcv_in_text, Charsets.UTF_8).hash();
                        
                        String[] md5_entry = {"MD5", hc_md5.toString()};
                        finished_hashing_list.add(md5_entry);
                        
                        break;
                    }
                case "MurmurHash3 (32-bit)":
                    {
                        HashCode hc_mm3_32 = Hashing.murmur3_32_fixed().newHasher().putString(rcv_in_text, Charsets.UTF_8).hash();
                        
                        String[] mm3_32_entry = {"MurmurHash3 (32-bit)", hc_mm3_32.toString()};
                        finished_hashing_list.add(mm3_32_entry);
                        
                        break;
                    }
                case "SHA-1":
                    {
                        HashCode hc_sha1 = Hashing.sha1().newHasher().putString(rcv_in_text, Charsets.UTF_8).hash();
                        
                        String[] sha1_entry = {"SHA-1", hc_sha1.toString()};
                        finished_hashing_list.add(sha1_entry);
                        
                        break;
                    }
                case "SHA-256":
                    {
                        HashCode hc_sha256 = Hashing.sha256().newHasher().putString(rcv_in_text, Charsets.UTF_8).hash();
                        
                        String[] sha256_entry = {"SHA-256", hc_sha256.toString()};
                        finished_hashing_list.add(sha256_entry);
                        
                        break;
                    }
                case "SipHash":
                    {
                        HashCode hc_sipash = Hashing.sipHash24().newHasher().putString(rcv_in_text, Charsets.UTF_8).hash();
                        
                        String[] sipash_entry = {"SipHash", hc_sipash.toString()};
                        finished_hashing_list.add(sipash_entry);
                        
                        break;
                    }
                default:
                    break;
            }
        }
        
        return finished_hashing_list;
    }
}
