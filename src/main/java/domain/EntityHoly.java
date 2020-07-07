@getter
@setter
@NoArgsConstructor
@AllArgsConstructor
@entity
public class EntityHoly extend abstractPersistable<Long> {

  privite String name;

  privite String s1;
  
  @NonNull
  privite String s2;
  
  @Getter
  privite String s3;
  
  @Setter
  privite String s3;
}
