@Runwith(SpringRunner.class)
@DataJapTest
public class DomainHolyTest {

@AutoWired
RepositoryHoly repository;

@Test
punlic void test(){
EntityHoly e=new EntityHoly();
assertThat(e.isNew()).isTrue();
repository.save(e);

}
}
