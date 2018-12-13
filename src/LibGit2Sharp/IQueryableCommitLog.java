package LibGit2Sharp;

import Common.Activation;
import static Common.Helper.Convert;
import static Common.Helper.getGetObjectName;
import static Common.Helper.getReturnObjectName;
import static Common.Helper.ConvertToConcreteInterfaceImplementation;
import Common.Helper;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import LibGit2Sharp.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;

public interface IQueryableCommitLog
    extends ICommitLog,
        jio.System.Collections.Generic.IEnumerable<Commit>,
        jio.System.Collections.IEnumerable {
  public ICommitLog QueryBy(CommitFilter filter);

  public jio.System.Collections.Generic.IEnumerable<LogEntry> QueryBy(java.lang.String path);

  public jio.System.Collections.Generic.IEnumerable<LogEntry> QueryBy(
      java.lang.String path, FollowFilter filter);

  public jio.System.Collections.Generic.IEnumerable<LogEntry> QueryBy(
      java.lang.String path, CommitFilter filter);
}
