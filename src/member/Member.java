package member;

import jenis_member.JenisMember;

public class Member {
  public String id;
  public String nama;
  public JenisMember jenisMember;

  public void setId(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getNama() {
    return nama;
  }

  public void setJenisMember(JenisMember jenisMember) {
    this.jenisMember = jenisMember;
  }

  public JenisMember getJenisMember() {
    return jenisMember;
  }
}
