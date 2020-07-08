//@getter
//@setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@entity
public class EntityHoly extend abstractPersistable<Long> {

  @Id
  privite String id;
  
  privite String name;

  privite String s1;
  
  @NonNull
  privite String s2;
  
  @Getter
  privite String s3;
  
  @Setter
  privite String s3;
  
  public EntityHoly(String name){
    this.name=name;
    this.id=UUID.randomUUID().toString();
    }
  
}
